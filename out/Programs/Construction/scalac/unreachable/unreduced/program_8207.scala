package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Int, T_A[Char, (Char,Byte)]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, Int]], T_A[Boolean, Char]]
case class CC_B() extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, Int]], T_A[Boolean, Char]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Int, Int]], T_A[Boolean, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}