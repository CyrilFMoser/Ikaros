package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Int, b: Byte, c: T_A[(Boolean,Byte), T_B[Int]]) extends T_A[T_A[T_B[Char], T_B[Char]], T_A[T_B[Int], T_A[Int, Byte]]]
case class CC_B() extends T_A[T_A[T_B[Char], T_B[Char]], T_A[T_B[Int], T_A[Int, Byte]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_B[Char], T_B[Char]], T_A[T_B[Int], T_A[Int, Byte]]]
case class CC_D[D](a: D, b: CC_C) extends T_B[D]

val v_a: T_A[T_A[T_B[Char], T_B[Char]], T_A[T_B[Int], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, _))