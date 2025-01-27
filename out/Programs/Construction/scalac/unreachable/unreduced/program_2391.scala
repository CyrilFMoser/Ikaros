package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B() extends T_B[T_B[Boolean, T_A[Boolean]], (T_A[Byte],CC_A[Byte])]
case class CC_C(a: T_B[T_B[CC_B, CC_B], (CC_B,CC_B)], b: CC_A[T_B[CC_B, CC_B]], c: Char) extends T_B[T_B[Boolean, T_A[Boolean]], (T_A[Byte],CC_A[Byte])]
case class CC_D(a: T_A[CC_C], b: CC_C, c: CC_B) extends T_B[T_B[Boolean, T_A[Boolean]], (T_A[Byte],CC_A[Byte])]

val v_a: T_B[T_B[Boolean, T_A[Boolean]], (T_A[Byte],CC_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_D(_, _, _)