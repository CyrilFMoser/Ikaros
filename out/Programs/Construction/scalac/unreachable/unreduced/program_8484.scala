package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_A[Char, Boolean]]) extends T_A[T_A[T_A[(Byte,Char), (Boolean,Byte)], Byte], T_A[T_B[Int], T_A[Int, Int]]]
case class CC_B() extends T_A[T_A[T_A[(Byte,Char), (Boolean,Byte)], Byte], T_A[T_B[Int], T_A[Int, Int]]]
case class CC_C(a: CC_B, b: Int, c: T_A[CC_B, (CC_A,CC_B)]) extends T_A[T_A[T_A[(Byte,Char), (Boolean,Byte)], Byte], T_A[T_B[Int], T_A[Int, Int]]]
case class CC_D[D](a: CC_C) extends T_B[D]

val v_a: T_A[T_A[T_A[(Byte,Char), (Boolean,Byte)], Byte], T_A[T_B[Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B()