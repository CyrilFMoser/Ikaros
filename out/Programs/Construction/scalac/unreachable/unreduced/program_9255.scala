package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_A[Char],Byte), b: T_A[T_A[Boolean]], c: T_B[T_B[Char]]) extends T_A[T_B[T_B[Byte]]]
case class CC_B(a: T_B[Int]) extends T_A[T_B[T_B[Byte]]]
case class CC_C[C](a: C) extends T_B[C]
case class CC_D(a: T_B[T_B[Byte]], b: CC_A) extends T_B[T_B[Byte]]

val v_a: T_A[T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_C(12)) => 1 
}
}
// This is not matched: CC_B(CC_C(_))