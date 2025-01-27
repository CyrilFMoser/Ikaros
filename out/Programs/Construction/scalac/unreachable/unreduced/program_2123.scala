package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (Boolean,T_A[Int, Char])) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Boolean]], T_A[T_A[Byte, Byte], Byte]]
case class CC_B(a: Byte) extends T_A[T_A[T_A[Int, Byte], T_A[Byte, Boolean]], T_A[T_A[Byte, Byte], Byte]]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Byte, Boolean]], T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}