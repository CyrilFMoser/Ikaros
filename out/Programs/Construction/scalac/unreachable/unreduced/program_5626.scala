package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Boolean, Byte],T_A[Int, Boolean])) extends T_A[T_A[T_A[Int, Boolean], Boolean], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]
case class CC_B[C](a: T_A[C, C]) extends T_A[T_A[T_A[Int, Boolean], Boolean], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]

val v_a: T_A[T_A[T_A[Int, Boolean], Boolean], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}