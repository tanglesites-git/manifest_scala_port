package com.tanglesites

import com.tanglesites.ManifestHttpClient.close
import com.tanglesites.ManifestHttpClient.get_Manifest
import com.tanglesites.Common.*
import com.tanglesites.ManifestRoot.*
import upickle.default.*

object ManifestPropertyService extends main {
  val manifestValue: ujson.Value = get_Manifest(Environments.DEVELOPMENT)
  val Root: ManifestRoot = read[ManifestRoot](os.read(FilePaths.MANIFEST))

  def Version: String = Root.Response.version

  def MobileWorldContent: Localization[String] =
    Root.Response.mobileWorldContentPaths

  def JsonWorldContent: Localization[String] =
    Root.Response.jsonWorldContentPaths

  def JsonWorldComponentContent: Localization[DestinyTable] =
    Root.Response.jsonWorldComponentContentPaths

  def MobileWorldContentPathLanguage(lang: String): String = lang match
    case "en"     => Root.Response.mobileWorldContentPaths.en
    case "es"     => Root.Response.mobileWorldContentPaths.es
    case "fr"     => Root.Response.mobileWorldContentPaths.fr
    case "es-mx"  => Root.Response.mobileWorldContentPaths.esMx
    case "de"     => Root.Response.mobileWorldContentPaths.de
    case "it"     => Root.Response.mobileWorldContentPaths.it
    case "ja"     => Root.Response.mobileWorldContentPaths.ja
    case "pt-br"  => Root.Response.mobileWorldContentPaths.ptBr
    case "ru"     => Root.Response.mobileWorldContentPaths.ru
    case "pl"     => Root.Response.mobileWorldContentPaths.pl
    case "ko"     => Root.Response.mobileWorldContentPaths.ko
    case "zh-cht" => Root.Response.mobileWorldContentPaths.zhCht
    case "zh-chs" => Root.Response.mobileWorldContentPaths.zhChs
    case _ =>
      println(s"Language: $lang does not exist")
      ""

  def JsonWorldContentPathLanguage(lang: String): String = lang match
    case "en"     => Root.Response.jsonWorldContentPaths.en
    case "es"     => Root.Response.jsonWorldContentPaths.es
    case "fr"     => Root.Response.jsonWorldContentPaths.fr
    case "es-mx"  => Root.Response.jsonWorldContentPaths.esMx
    case "de"     => Root.Response.jsonWorldContentPaths.de
    case "it"     => Root.Response.jsonWorldContentPaths.it
    case "ja"     => Root.Response.jsonWorldContentPaths.ja
    case "pt-br"  => Root.Response.jsonWorldContentPaths.ptBr
    case "ru"     => Root.Response.jsonWorldContentPaths.ru
    case "pl"     => Root.Response.jsonWorldContentPaths.pl
    case "ko"     => Root.Response.jsonWorldContentPaths.ko
    case "zh-cht" => Root.Response.jsonWorldContentPaths.zhCht
    case "zh-chs" => Root.Response.jsonWorldContentPaths.zhChs
    case _ =>
      println(s"Language: $lang does not exist")
      ""

  def JsonWorldComponentContentPaths(lang: String): DestinyTable = lang match
    case "en"     => Root.Response.jsonWorldComponentContentPaths.en
    case "es"     => Root.Response.jsonWorldComponentContentPaths.es
    case "fr"     => Root.Response.jsonWorldComponentContentPaths.fr
    case "es-mx"  => Root.Response.jsonWorldComponentContentPaths.esMx
    case "de"     => Root.Response.jsonWorldComponentContentPaths.de
    case "it"     => Root.Response.jsonWorldComponentContentPaths.it
    case "ja"     => Root.Response.jsonWorldComponentContentPaths.ja
    case "pt-br"  => Root.Response.jsonWorldComponentContentPaths.ptBr
    case "ru"     => Root.Response.jsonWorldComponentContentPaths.ru
    case "pl"     => Root.Response.jsonWorldComponentContentPaths.pl
    case "ko"     => Root.Response.jsonWorldComponentContentPaths.ko
    case "zh-cht" => Root.Response.jsonWorldComponentContentPaths.zhCht
    case "zh-chs" => Root.Response.jsonWorldComponentContentPaths.zhChs
    case _ =>
      println(s"Language: $lang does not exist")
      DestinyTable()

  def JsonWorldComponentContentTables(
      tableName: DestinyTableNames,
      lang: String
  ): String =
    val component: DestinyTable = JsonWorldComponentContentPaths(lang)
    tableName match
      case DestinyTableNames.DestinyArtDyeChannelDefinition =>
        component.DestinyArtDyeChannelDefinition
      case DestinyTableNames.DestinyArtDyeReferenceDefinition =>
        component.DestinyArtDyeReferenceDefinition
      case DestinyTableNames.DestinyPlaceDefinition =>
        component.DestinyPlaceDefinition
      case DestinyTableNames.DestinyActivityDefinition =>
        component.DestinyActivityDefinition
      case DestinyTableNames.DestinyActivityTypeDefinition =>
        component.DestinyActivityTypeDefinition
      case DestinyTableNames.DestinyClassDefinition =>
        component.DestinyClassDefinition
      case DestinyTableNames.DestinyGenderDefinition =>
        component.DestinyGenderDefinition
      case DestinyTableNames.DestinyInventoryBucketDefinition =>
        component.DestinyInventoryBucketDefinition
      case DestinyTableNames.DestinyRaceDefinition =>
        component.DestinyRaceDefinition
      case DestinyTableNames.DestinyUnlockDefinition =>
        component.DestinyUnlockDefinition
      case DestinyTableNames.DestinyStatGroupDefinition =>
        component.DestinyStatGroupDefinition
      case DestinyTableNames.DestinyProgressionMappingDefinition =>
        component.DestinyProgressionMappingDefinition
      case DestinyTableNames.DestinyFactionDefinition =>
        component.DestinyFactionDefinition
      case DestinyTableNames.DestinyVendorGroupDefinition =>
        component.DestinyVendorGroupDefinition
      case DestinyTableNames.DestinyRewardSourceDefinition =>
        component.DestinyRewardSourceDefinition
      case DestinyTableNames.DestinyUnlockValueDefinition =>
        component.DestinyUnlockValueDefinition
      case DestinyTableNames.DestinyRewardMappingDefinition =>
        component.DestinyRewardMappingDefinition
      case DestinyTableNames.DestinyRewardSheetDefinition =>
        component.DestinyRewardSheetDefinition
      case DestinyTableNames.DestinyItemCategoryDefinition =>
        component.DestinyItemCategoryDefinition
      case DestinyTableNames.DestinyDamageTypeDefinition =>
        component.DestinyDamageTypeDefinition
      case DestinyTableNames.DestinyActivityModeDefinition =>
        component.DestinyActivityModeDefinition
      case DestinyTableNames.DestinyMedalTierDefinition =>
        component.DestinyMedalTierDefinition
      case DestinyTableNames.DestinyAchievementDefinition =>
        component.DestinyAchievementDefinition
      case DestinyTableNames.DestinyActivityGraphDefinition =>
        component.DestinyActivityGraphDefinition
      case DestinyTableNames.DestinyActivityInteractableDefinition =>
        component.DestinyActivityInteractableDefinition
      case DestinyTableNames.DestinyBondDefinition =>
        component.DestinyBondDefinition
      case DestinyTableNames.DestinyCharacterCustomizationCategoryDefinition =>
        component.DestinyCharacterCustomizationCategoryDefinition
      case DestinyTableNames.DestinyCharacterCustomizationOptionDefinition =>
        component.DestinyCharacterCustomizationOptionDefinition
      case DestinyTableNames.DestinyCollectibleDefinition =>
        component.DestinyCollectibleDefinition
      case DestinyTableNames.DestinyDestinationDefinition =>
        component.DestinyDestinationDefinition
      case DestinyTableNames.DestinyEntitlementOfferDefinition =>
        component.DestinyEntitlementOfferDefinition
      case DestinyTableNames.DestinyEquipmentSlotDefinition =>
        component.DestinyEquipmentSlotDefinition
      case DestinyTableNames.DestinyEventCardDefinition =>
        component.DestinyEventCardDefinition
      case DestinyTableNames.DestinyFireteamFinderActivityGraphDefinition =>
        component.DestinyFireteamFinderActivityGraphDefinition
      case DestinyTableNames.DestinyFireteamFinderActivitySetDefinition =>
        component.DestinyFireteamFinderActivitySetDefinition
      case DestinyTableNames.DestinyFireteamFinderLabelDefinition =>
        component.DestinyFireteamFinderLabelDefinition
      case DestinyTableNames.DestinyFireteamFinderLabelGroupDefinition =>
        component.DestinyFireteamFinderLabelGroupDefinition
      case DestinyTableNames.DestinyFireteamFinderOptionDefinition =>
        component.DestinyFireteamFinderOptionDefinition
      case DestinyTableNames.DestinyFireteamFinderOptionGroupDefinition =>
        component.DestinyFireteamFinderOptionGroupDefinition
      case DestinyTableNames.DestinyStatDefinition =>
        component.DestinyStatDefinition
      case DestinyTableNames.DestinyInventoryItemDefinition =>
        component.DestinyInventoryItemDefinition
      case DestinyTableNames.DestinyInventoryItemLiteDefinition =>
        component.DestinyInventoryItemLiteDefinition
      case DestinyTableNames.DestinyItemTierTypeDefinition =>
        component.DestinyItemTierTypeDefinition
      case DestinyTableNames.DestinyLoadoutColorDefinition =>
        component.DestinyLoadoutColorDefinition
      case DestinyTableNames.DestinyLoadoutIconDefinition =>
        component.DestinyLoadoutIconDefinition
      case DestinyTableNames.DestinyLoadoutNameDefinition =>
        component.DestinyLoadoutNameDefinition
      case DestinyTableNames.DestinyLocationDefinition =>
        component.DestinyLocationDefinition
      case DestinyTableNames.DestinyLoreDefinition =>
        component.DestinyLoreDefinition
      case DestinyTableNames.DestinyMaterialRequirementSetDefinition =>
        component.DestinyMaterialRequirementSetDefinition
      case DestinyTableNames.DestinyMetricDefinition =>
        component.DestinyMetricDefinition
      case DestinyTableNames.DestinyObjectiveDefinition =>
        component.DestinyObjectiveDefinition
      case DestinyTableNames.DestinySandboxPerkDefinition =>
        component.DestinySandboxPerkDefinition
      case DestinyTableNames.DestinyPlatformBucketMappingDefinition =>
        component.DestinyPlatformBucketMappingDefinition
      case DestinyTableNames.DestinyPlugSetDefinition =>
        component.DestinyPlugSetDefinition
      case DestinyTableNames.DestinyPowerCapDefinition =>
        component.DestinyPowerCapDefinition
      case DestinyTableNames.DestinyPresentationNodeDefinition =>
        component.DestinyPresentationNodeDefinition
      case DestinyTableNames.DestinyProgressionDefinition =>
        component.DestinyProgressionDefinition
      case DestinyTableNames.DestinyProgressionLevelRequirementDefinition =>
        component.DestinyProgressionLevelRequirementDefinition
      case DestinyTableNames.DestinyRecordDefinition =>
        component.DestinyRecordDefinition
      case DestinyTableNames.DestinyRewardAdjusterPointerDefinition =>
        component.DestinyRewardAdjusterPointerDefinition
      case DestinyTableNames.DestinyRewardAdjusterProgressionMapDefinition =>
        component.DestinyRewardAdjusterProgressionMapDefinition
      case DestinyTableNames.DestinyRewardItemListDefinition =>
        component.DestinyRewardItemListDefinition
      case DestinyTableNames.DestinySackRewardItemListDefinition =>
        component.DestinySackRewardItemListDefinition
      case DestinyTableNames.DestinySandboxPatternDefinition =>
        component.DestinySandboxPatternDefinition
      case DestinyTableNames.DestinySeasonDefinition =>
        component.DestinySeasonDefinition
      case DestinyTableNames.DestinySeasonPassDefinition =>
        component.DestinySeasonPassDefinition
      case DestinyTableNames.DestinySocialCommendationDefinition =>
        component.DestinySocialCommendationDefinition
      case DestinyTableNames.DestinySocketCategoryDefinition =>
        component.DestinySocketCategoryDefinition
      case DestinyTableNames.DestinySocketTypeDefinition =>
        component.DestinySocketTypeDefinition
      case DestinyTableNames.DestinyTraitDefinition =>
        component.DestinyTraitDefinition
      case DestinyTableNames.DestinyUnlockCountMappingDefinition =>
        component.DestinyUnlockCountMappingDefinition
      case DestinyTableNames.DestinyUnlockEventDefinition =>
        component.DestinyUnlockEventDefinition
      case DestinyTableNames.DestinyUnlockExpressionMappingDefinition =>
        component.DestinyUnlockExpressionMappingDefinition
      case DestinyTableNames.DestinyVendorDefinition =>
        component.DestinyVendorDefinition
      case DestinyTableNames.DestinyMilestoneDefinition =>
        component.DestinyMilestoneDefinition
      case DestinyTableNames.DestinyActivityModifierDefinition =>
        component.DestinyActivityModifierDefinition
      case DestinyTableNames.DestinyReportReasonCategoryDefinition =>
        component.DestinyReportReasonCategoryDefinition
      case DestinyTableNames.DestinyArtifactDefinition =>
        component.DestinyArtifactDefinition
      case DestinyTableNames.DestinyBreakerTypeDefinition =>
        component.DestinyBreakerTypeDefinition
      case DestinyTableNames.DestinyChecklistDefinition =>
        component.DestinyChecklistDefinition
      case DestinyTableNames.DestinyEnergyTypeDefinition =>
        component.DestinyEnergyTypeDefinition
      case DestinyTableNames.DestinySocialCommendationNodeDefinition =>
        component.DestinySocialCommendationNodeDefinition
      case DestinyTableNames.DestinyGuardianRankDefinition =>
        component.DestinyGuardianRankDefinition
      case DestinyTableNames.DestinyGuardianRankConstantsDefinition =>
        component.DestinyGuardianRankConstantsDefinition
      case DestinyTableNames.DestinyLoadoutConstantsDefinition =>
        component.DestinyLoadoutConstantsDefinition
      case DestinyTableNames.DestinyFireteamFinderConstantsDefinition =>
        component.DestinyFireteamFinderConstantsDefinition
      case DestinyTableNames.DestinyGlobalConstantsDefinition =>
        component.DestinyGlobalConstantsDefinition
      case null =>
        println(
          s"Table Name: $tableName does not exist with respect to language: $lang"
        )
        ""

  def JsonWorldComponentContentTables(
      tableName: String,
      lang: String
  ): String =
    val component: DestinyTable = JsonWorldComponentContentPaths(lang)
    tableName match
      case "DestinyArtDyeChannelDefinition" =>
        component.DestinyArtDyeChannelDefinition
      case "DestinyArtDyeReferenceDefinition" =>
        component.DestinyArtDyeReferenceDefinition
      case "DestinyPlaceDefinition" =>
        component.DestinyPlaceDefinition
      case "DestinyActivityDefinition" =>
        component.DestinyActivityDefinition
      case "DestinyActivityTypeDefinition" =>
        component.DestinyActivityTypeDefinition
      case "DestinyClassDefinition" =>
        component.DestinyClassDefinition
      case "DestinyGenderDefinition" =>
        component.DestinyGenderDefinition
      case "DestinyInventoryBucketDefinition" =>
        component.DestinyInventoryBucketDefinition
      case "DestinyRaceDefinition" =>
        component.DestinyRaceDefinition
      case "DestinyUnlockDefinition" =>
        component.DestinyUnlockDefinition
      case "DestinyStatGroupDefinition" =>
        component.DestinyStatGroupDefinition
      case "DestinyProgressionMappingDefinition" =>
        component.DestinyProgressionMappingDefinition
      case "DestinyFactionDefinition" =>
        component.DestinyFactionDefinition
      case "DestinyVendorGroupDefinition" =>
        component.DestinyVendorGroupDefinition
      case "DestinyRewardSourceDefinition" =>
        component.DestinyRewardSourceDefinition
      case "DestinyUnlockValueDefinition" =>
        component.DestinyUnlockValueDefinition
      case "DestinyRewardMappingDefinition" =>
        component.DestinyRewardMappingDefinition
      case "DestinyRewardSheetDefinition" =>
        component.DestinyRewardSheetDefinition
      case "DestinyItemCategoryDefinition" =>
        component.DestinyItemCategoryDefinition
      case "DestinyDamageTypeDefinition" =>
        component.DestinyDamageTypeDefinition
      case "DestinyActivityModeDefinition" =>
        component.DestinyActivityModeDefinition
      case "DestinyMedalTierDefinition" =>
        component.DestinyMedalTierDefinition
      case "DestinyAchievementDefinition" =>
        component.DestinyAchievementDefinition
      case "DestinyActivityGraphDefinition" =>
        component.DestinyActivityGraphDefinition
      case "DestinyActivityInteractableDefinition" =>
        component.DestinyActivityInteractableDefinition
      case "DestinyBondDefinition" =>
        component.DestinyBondDefinition
      case "DestinyCharacterCustomizationCategoryDefinition" =>
        component.DestinyCharacterCustomizationCategoryDefinition
      case "DestinyCharacterCustomizationOptionDefinition" =>
        component.DestinyCharacterCustomizationOptionDefinition
      case "DestinyCollectibleDefinition" =>
        component.DestinyCollectibleDefinition
      case "DestinyDestinationDefinition" =>
        component.DestinyDestinationDefinition
      case "DestinyEntitlementOfferDefinition" =>
        component.DestinyEntitlementOfferDefinition
      case "DestinyEquipmentSlotDefinition" =>
        component.DestinyEquipmentSlotDefinition
      case "DestinyEventCardDefinition" =>
        component.DestinyEventCardDefinition
      case "DestinyFireteamFinderActivityGraphDefinition" =>
        component.DestinyFireteamFinderActivityGraphDefinition
      case "DestinyFireteamFinderActivitySetDefinition" =>
        component.DestinyFireteamFinderActivitySetDefinition
      case "DestinyFireteamFinderLabelDefinition" =>
        component.DestinyFireteamFinderLabelDefinition
      case "DestinyFireteamFinderLabelGroupDefinition" =>
        component.DestinyFireteamFinderLabelGroupDefinition
      case "DestinyFireteamFinderOptionDefinition" =>
        component.DestinyFireteamFinderOptionDefinition
      case "DestinyFireteamFinderOptionGroupDefinition" =>
        component.DestinyFireteamFinderOptionGroupDefinition
      case "DestinyStatDefinition" =>
        component.DestinyStatDefinition
      case "DestinyInventoryItemDefinition" =>
        component.DestinyInventoryItemDefinition
      case "DestinyInventoryItemLiteDefinition" =>
        component.DestinyInventoryItemLiteDefinition
      case "DestinyItemTierTypeDefinition" =>
        component.DestinyItemTierTypeDefinition
      case "DestinyLoadoutColorDefinition" =>
        component.DestinyLoadoutColorDefinition
      case "DestinyLoadoutIconDefinition" =>
        component.DestinyLoadoutIconDefinition
      case "DestinyLoadoutNameDefinition" =>
        component.DestinyLoadoutNameDefinition
      case "DestinyLocationDefinition" =>
        component.DestinyLocationDefinition
      case "DestinyLoreDefinition" =>
        component.DestinyLoreDefinition
      case "DestinyMaterialRequirementSetDefinition" =>
        component.DestinyMaterialRequirementSetDefinition
      case "DestinyMetricDefinition" =>
        component.DestinyMetricDefinition
      case "DestinyObjectiveDefinition" =>
        component.DestinyObjectiveDefinition
      case "DestinySandboxPerkDefinition" =>
        component.DestinySandboxPerkDefinition
      case "DestinyPlatformBucketMappingDefinition" =>
        component.DestinyPlatformBucketMappingDefinition
      case "DestinyPlugSetDefinition" =>
        component.DestinyPlugSetDefinition
      case "DestinyPowerCapDefinition" =>
        component.DestinyPowerCapDefinition
      case "DestinyPresentationNodeDefinition" =>
        component.DestinyPresentationNodeDefinition
      case "DestinyProgressionDefinition" =>
        component.DestinyProgressionDefinition
      case "DestinyProgressionLevelRequirementDefinition" =>
        component.DestinyProgressionLevelRequirementDefinition
      case "DestinyRecordDefinition" =>
        component.DestinyRecordDefinition
      case "DestinyRewardAdjusterPointerDefinition" =>
        component.DestinyRewardAdjusterPointerDefinition
      case "DestinyRewardAdjusterProgressionMapDefinition" =>
        component.DestinyRewardAdjusterProgressionMapDefinition
      case "DestinyRewardItemListDefinition" =>
        component.DestinyRewardItemListDefinition
      case "DestinySackRewardItemListDefinition" =>
        component.DestinySackRewardItemListDefinition
      case "DestinySandboxPatternDefinition" =>
        component.DestinySandboxPatternDefinition
      case "DestinySeasonDefinition" =>
        component.DestinySeasonDefinition
      case "DestinySeasonPassDefinition" =>
        component.DestinySeasonPassDefinition
      case "DestinySocialCommendationDefinition" =>
        component.DestinySocialCommendationDefinition
      case "DestinySocketCategoryDefinition" =>
        component.DestinySocketCategoryDefinition
      case "DestinySocketTypeDefinition" =>
        component.DestinySocketTypeDefinition
      case "DestinyTraitDefinition" =>
        component.DestinyTraitDefinition
      case "DestinyUnlockCountMappingDefinition" =>
        component.DestinyUnlockCountMappingDefinition
      case "DestinyUnlockEventDefinition" =>
        component.DestinyUnlockEventDefinition
      case "DestinyUnlockExpressionMappingDefinition" =>
        component.DestinyUnlockExpressionMappingDefinition
      case "DestinyVendorDefinition" =>
        component.DestinyVendorDefinition
      case "DestinyMilestoneDefinition" =>
        component.DestinyMilestoneDefinition
      case "DestinyActivityModifierDefinition" =>
        component.DestinyActivityModifierDefinition
      case "DestinyReportReasonCategoryDefinition" =>
        component.DestinyReportReasonCategoryDefinition
      case "DestinyArtifactDefinition" =>
        component.DestinyArtifactDefinition
      case "DestinyBreakerTypeDefinition" =>
        component.DestinyBreakerTypeDefinition
      case "DestinyChecklistDefinition" =>
        component.DestinyChecklistDefinition
      case "DestinyEnergyTypeDefinition" =>
        component.DestinyEnergyTypeDefinition
      case "DestinySocialCommendationNodeDefinition" =>
        component.DestinySocialCommendationNodeDefinition
      case "DestinyGuardianRankDefinition" =>
        component.DestinyGuardianRankDefinition
      case "DestinyGuardianRankConstantsDefinition" =>
        component.DestinyGuardianRankConstantsDefinition
      case "DestinyLoadoutConstantsDefinition" =>
        component.DestinyLoadoutConstantsDefinition
      case "DestinyFireteamFinderConstantsDefinition" =>
        component.DestinyFireteamFinderConstantsDefinition
      case "DestinyGlobalConstantsDefinition" =>
        component.DestinyGlobalConstantsDefinition
      case null =>
        println(
          s"Table Name: $tableName does not exist with respect to language: $lang"
        )
        ""

}
