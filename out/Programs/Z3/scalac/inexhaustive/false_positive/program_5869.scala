package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_C[E]() extends T_B[E]
case class CC_D[F](a: T_A, b: T_B[F]) extends T_B[F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_D(_, _)) => 0 
}
}
// This is not matched: (CC_B Char
//      (CC_B Char (CC_B Char Wildcard Wildcard (T_A Char)) Int (T_A Char))
//      Int
//      (T_A Char))