package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D]) extends T_A[D, (T_B[(Char,Char)],T_B[Char])]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}