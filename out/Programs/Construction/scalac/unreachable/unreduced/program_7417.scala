package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Char, T_A[Char, Byte]], b: Int, c: T_A[T_A[Byte, Byte], T_A[Int, Boolean]]) extends T_A[Char, T_A[T_A[Byte, Byte], T_A[Int, (Byte,Boolean)]]]
case class CC_B() extends T_A[Char, T_A[T_A[Byte, Byte], T_A[Int, (Byte,Boolean)]]]

val v_a: T_A[Char, T_A[T_A[Byte, Byte], T_A[Int, (Byte,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}