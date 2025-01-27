package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_B[F](a: F, b: T_B[F, F]) extends T_B[F, (Int,Int)]

val v_a: T_B[Char, (Int,Int)] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_C Int Boolean (T_A (Tuple Boolean Char) Int))