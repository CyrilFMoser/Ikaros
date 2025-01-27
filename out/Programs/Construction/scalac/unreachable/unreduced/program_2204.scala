package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: T_A[T_A[Int, Byte], T_A[(Byte,Boolean), Byte]], c: Char) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Boolean]], T_A[Int, T_A[Char, Int]]]
case class CC_B() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Boolean]], T_A[Int, T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Boolean]], T_A[Int, T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}