package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[E, T_B[T_B[Byte, (Byte,Byte)], T_A[Int, Boolean]]]
case class CC_B(a: (T_A[(Int,Char), Byte],T_A[Boolean, Char]), b: T_B[T_B[Boolean, Int], T_A[Boolean, Byte]], c: T_B[T_A[Int, Byte], Int]) extends T_B[(T_B[Byte, Int],Byte), CC_A[Int]]
case class CC_C() extends T_B[(T_B[Byte, Int],Byte), CC_A[Int]]

val v_a: T_B[(T_B[Byte, Int],Byte), CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _, _) => 0 
  case CC_C() => 1 
}
}