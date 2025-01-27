package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Byte, Byte]], b: T_A[T_A[Char, Char], T_A[Boolean, Int]]) extends T_A[T_A[Boolean, T_A[(Char,Char), Int]], T_A[T_A[Boolean, Char], Boolean]]
case class CC_B() extends T_A[T_A[Boolean, T_A[(Char,Char), Int]], T_A[T_A[Boolean, Char], Boolean]]

val v_a: T_A[T_A[Boolean, T_A[(Char,Char), Int]], T_A[T_A[Boolean, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}