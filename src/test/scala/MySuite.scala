import com.tanglesites.infrastructure.ManifestPropertyService.*

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class MySuite extends munit.FunSuite {
  test("MobileWorldContentPathLanguage returns non-empty value") {
    val ListOfValues = List(
      "en",
      "fr",
      "es",
      "es-mx",
      "de",
      "it",
      "ja",
      "pt-br",
      "ru",
      "pl",
      "ko",
      "zh-cht",
      "zh-chs"
    )
    assert(
      ListOfValues.forall(x =>
        MobileWorldContentPathLanguage(x).isEmpty == false
      )
    )
  }

  test("JsonWorldContentPathLanguage returns non-empty value") {
    val ListOfValues = List(
      "en",
      "fr",
      "es",
      "es-mx",
      "de",
      "it",
      "ja",
      "pt-br",
      "ru",
      "pl",
      "ko",
      "zh-cht",
      "zh-chs"
    )
    assert(
      ListOfValues.forall(x => JsonWorldContentPathLanguage(x).isEmpty == false)
    )
  }

  test("JsonWorldComponentContentPaths returns non-empty value") {
    val ListOfValues = List(
      "en",
      "fr",
      "es",
      "es-mx",
      "de",
      "it",
      "ja",
      "pt-br",
      "ru",
      "pl",
      "ko",
      "zh-cht",
      "zh-chs"
    )
    val ListOfTableNames = List(
      "DestinyArtDyeChannelDefinition",
      "DestinyArtDyeReferenceDefinition",
      "DestinyPlaceDefinition",
      "DestinyActivityDefinition",
      "DestinyActivityTypeDefinition",
      "DestinyClassDefinition",
      "DestinyGenderDefinition",
      "DestinyInventoryBucketDefinition",
      "DestinyRaceDefinition",
      "DestinyUnlockDefinition",
      "DestinyStatGroupDefinition",
      "DestinyProgressionMappingDefinition",
      "DestinyFactionDefinition",
      "DestinyVendorGroupDefinition",
      "DestinyRewardSourceDefinition",
      "DestinyUnlockValueDefinition",
      "DestinyRewardMappingDefinition",
      "DestinyRewardSheetDefinition",
      "DestinyItemCategoryDefinition",
      "DestinyDamageTypeDefinition",
      "DestinyActivityModeDefinition",
      "DestinyMedalTierDefinition",
      "DestinyAchievementDefinition",
      "DestinyActivityGraphDefinition",
      "DestinyActivityInteractableDefinition",
      "DestinyBondDefinition",
      "DestinyCharacterCustomizationCategoryDefinition",
      "DestinyCharacterCustomizationOptionDefinition",
      "DestinyCollectibleDefinition",
      "DestinyDestinationDefinition",
      "DestinyEntitlementOfferDefinition",
      "DestinyEquipmentSlotDefinition",
      "DestinyEventCardDefinition",
      "DestinyFireteamFinderActivityGraphDefinition",
      "DestinyFireteamFinderActivitySetDefinition",
      "DestinyFireteamFinderLabelDefinition",
      "DestinyFireteamFinderLabelGroupDefinition",
      "DestinyFireteamFinderOptionDefinition",
      "DestinyFireteamFinderOptionGroupDefinition",
      "DestinyStatDefinition",
      "DestinyInventoryItemDefinition",
      "DestinyInventoryItemLiteDefinition",
      "DestinyItemTierTypeDefinition",
      "DestinyLoadoutColorDefinition",
      "DestinyLoadoutIconDefinition",
      "DestinyLoadoutNameDefinition",
      "DestinyLocationDefinition",
      "DestinyLoreDefinition",
      "DestinyMaterialRequirementSetDefinition",
      "DestinyMetricDefinition",
      "DestinyObjectiveDefinition",
      "DestinySandboxPerkDefinition",
      "DestinyPlatformBucketMappingDefinition",
      "DestinyPlugSetDefinition",
      "DestinyPowerCapDefinition",
      "DestinyPresentationNodeDefinition",
      "DestinyProgressionDefinition",
      "DestinyProgressionLevelRequirementDefinition",
      "DestinyRecordDefinition",
      "DestinyRewardAdjusterPointerDefinition",
      "DestinyRewardAdjusterProgressionMapDefinition",
      "DestinyRewardItemListDefinition",
      "DestinySackRewardItemListDefinition",
      "DestinySandboxPatternDefinition",
      "DestinySeasonDefinition",
      "DestinySeasonPassDefinition",
      "DestinySocialCommendationDefinition",
      "DestinySocketCategoryDefinition",
      "DestinySocketTypeDefinition",
      "DestinyTraitDefinition",
      "DestinyUnlockCountMappingDefinition",
      "DestinyUnlockEventDefinition",
      "DestinyUnlockExpressionMappingDefinition",
      "DestinyVendorDefinition",
      "DestinyMilestoneDefinition",
      "DestinyActivityModifierDefinition",
      "DestinyReportReasonCategoryDefinition",
      "DestinyArtifactDefinition",
      "DestinyBreakerTypeDefinition",
      "DestinyChecklistDefinition",
      "DestinyEnergyTypeDefinition",
      "DestinySocialCommendationNodeDefinition",
      "DestinyGuardianRankDefinition",
      "DestinyGuardianRankConstantsDefinition",
      "DestinyLoadoutConstantsDefinition",
      "DestinyFireteamFinderConstantsDefinition",
      "DestinyGlobalConstantsDefinition"
    )

    val pairs = for {
      lang <- ListOfValues
      table <- ListOfTableNames
    } yield List(lang, table)

    assert(
      pairs.forall(x => {
        val result = JsonWorldComponentContentTables(x.last, x.head)
        result.isEmpty == false
      })
    )
  }
}
