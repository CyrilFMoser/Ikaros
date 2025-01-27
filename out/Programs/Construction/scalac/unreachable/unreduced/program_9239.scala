package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: T_A[C, C]) extends T_A[T_A[C, (Boolean,Byte)], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, T_A[Int, Boolean]], (Boolean,Byte)], T_A[Boolean, T_A[Int, Boolean]]]

val v_a: T_A[T_A[T_A[Boolean, T_A[Int, Boolean]], (Boolean,Byte)], T_A[Boolean, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}