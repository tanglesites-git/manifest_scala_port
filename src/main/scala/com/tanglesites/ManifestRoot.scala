package com.tanglesites

import upickle.default.*

case class ManifestMessageData() derives ReadWriter

case class ManifestMobileGearCDN(
    val Geometry: String,
    val Texture: String,
    val PlateRegion: String,
    val Gear: String,
    val Shader: String
) derives ReadWriter

case class DestinyTable(
    val DestinyArtDyeChannelDefinition: String,
    val DestinyArtDyeReferenceDefinition: String,
    val DestinyPlaceDefinition: String,
    val DestinyActivityDefinition: String,
    val DestinyActivityTypeDefinition: String,
    val DestinyClassDefinition: String,
    val DestinyGenderDefinition: String,
    val DestinyInventoryBucketDefinition: String,
    val DestinyRaceDefinition: String,
    val DestinyUnlockDefinition: String,
    val DestinyStatGroupDefinition: String,
    val DestinyProgressionMappingDefinition: String,
    val DestinyFactionDefinition: String,
    val DestinyVendorGroupDefinition: String,
    val DestinyRewardSourceDefinition: String,
    val DestinyUnlockValueDefinition: String,
    val DestinyRewardMappingDefinition: String,
    val DestinyRewardSheetDefinition: String,
    val DestinyItemCategoryDefinition: String,
    val DestinyDamageTypeDefinition: String,
    val DestinyActivityModeDefinition: String,
    val DestinyMedalTierDefinition: String,
    val DestinyAchievementDefinition: String,
    val DestinyActivityGraphDefinition: String,
    val DestinyActivityInteractableDefinition: String,
    val DestinyBondDefinition: String,
    val DestinyCharacterCustomizationCategoryDefinition: String,
    val DestinyCharacterCustomizationOptionDefinition: String,
    val DestinyCollectibleDefinition: String,
    val DestinyDestinationDefinition: String,
    val DestinyEntitlementOfferDefinition: String,
    val DestinyEquipmentSlotDefinition: String,
    val DestinyEventCardDefinition: String,
    val DestinyFireteamFinderActivityGraphDefinition: String,
    val DestinyFireteamFinderActivitySetDefinition: String,
    val DestinyFireteamFinderLabelDefinition: String,
    val DestinyFireteamFinderLabelGroupDefinition: String,
    val DestinyFireteamFinderOptionDefinition: String,
    val DestinyFireteamFinderOptionGroupDefinition: String,
    val DestinyStatDefinition: String,
    val DestinyInventoryItemDefinition: String,
    val DestinyInventoryItemLiteDefinition: String,
    val DestinyItemTierTypeDefinition: String,
    val DestinyLoadoutColorDefinition: String,
    val DestinyLoadoutIconDefinition: String,
    val DestinyLoadoutNameDefinition: String,
    val DestinyLocationDefinition: String,
    val DestinyLoreDefinition: String,
    val DestinyMaterialRequirementSetDefinition: String,
    val DestinyMetricDefinition: String,
    val DestinyObjectiveDefinition: String,
    val DestinySandboxPerkDefinition: String,
    val DestinyPlatformBucketMappingDefinition: String,
    val DestinyPlugSetDefinition: String,
    val DestinyPowerCapDefinition: String,
    val DestinyPresentationNodeDefinition: String,
    val DestinyProgressionDefinition: String,
    val DestinyProgressionLevelRequirementDefinition: String,
    val DestinyRecordDefinition: String,
    val DestinyRewardAdjusterPointerDefinition: String,
    val DestinyRewardAdjusterProgressionMapDefinition: String,
    val DestinyRewardItemListDefinition: String,
    val DestinySackRewardItemListDefinition: String,
    val DestinySandboxPatternDefinition: String,
    val DestinySeasonDefinition: String,
    val DestinySeasonPassDefinition: String,
    val DestinySocialCommendationDefinition: String,
    val DestinySocketCategoryDefinition: String,
    val DestinySocketTypeDefinition: String,
    val DestinyTraitDefinition: String,
    val DestinyUnlockCountMappingDefinition: String,
    val DestinyUnlockEventDefinition: String,
    val DestinyUnlockExpressionMappingDefinition: String,
    val DestinyVendorDefinition: String,
    val DestinyMilestoneDefinition: String,
    val DestinyActivityModifierDefinition: String,
    val DestinyReportReasonCategoryDefinition: String,
    val DestinyArtifactDefinition: String,
    val DestinyBreakerTypeDefinition: String,
    val DestinyChecklistDefinition: String,
    val DestinyEnergyTypeDefinition: String,
    val DestinySocialCommendationNodeDefinition: String,
    val DestinyGuardianRankDefinition: String,
    val DestinyGuardianRankConstantsDefinition: String,
    val DestinyLoadoutConstantsDefinition: String,
    val DestinyFireteamFinderConstantsDefinition: String,
    val DestinyGlobalConstantsDefinition: String
) derives ReadWriter

case class Localization[T](
    val en: T,
    val fr: T,
    val es: T,
    @upickle.implicits.key("es-mx") val esMx: T,
    val de: T,
    val it: T,
    val ja: T,
    @upickle.implicits.key("pt-br") val ptBr: T,
    val ru: T,
    val pl: T,
    val ko: T,
    @upickle.implicits.key("zh-cht") val zhCht: T,
    @upickle.implicits.key("zh-chs") val zhChs: T
) derives ReadWriter

final case class ManifestMobileGearAssetDataBases(
    val version: Int,
    val path: String
) derives ReadWriter

final case class ManfestRootResponse(
    val version: String,
    val mobileAssetContentPath: String,
    val mobileGearAssetDataBases: List[ManifestMobileGearAssetDataBases],
    val mobileWorldContentPaths: Localization[String],
    val jsonWorldContentPaths: Localization[String],
    val jsonWorldComponentContentPaths: Localization[DestinyTable],
    val mobileClanBannerDatabasePath: String,
    val mobileGearCDN: ManifestMobileGearCDN,
    val iconImagePyramidInfo: List[String]
) derives ReadWriter

final case class ManifestRoot(
    val Response: ManfestRootResponse,
    ErrorCode: Int,
    ThrottleSeconds: Int,
    ErrorStatus: String,
    Message: String,
    MessageData: ManifestMessageData
) derives ReadWriter
