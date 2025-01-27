package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[T_A[(Char,Char), (Char,Char)], (Char,Char)], b: T_A[T_A[T_A[Boolean, Char], T_A[Boolean, Char]], T_A[Boolean, Char]]) extends T_A[T_A[Boolean, Boolean], Boolean]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}