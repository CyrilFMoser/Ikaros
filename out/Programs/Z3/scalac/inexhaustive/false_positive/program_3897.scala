package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[Char, D]) extends T_A[D]
case class CC_C[F]() extends T_A[F]
case class CC_F[I]() extends T_B[I, (Boolean,Boolean)]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_B Wildcard Byte Wildcard (T_A (Tuple Byte (Tuple Int Int))))