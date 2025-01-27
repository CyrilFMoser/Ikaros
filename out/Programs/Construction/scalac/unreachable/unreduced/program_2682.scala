package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Boolean],T_A[Byte]), b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B(a: T_B[T_B[(Char,Byte), Boolean], CC_A[Char]], b: T_A[T_A[Int]]) extends T_B[Char, T_A[T_A[Int]]]
case class CC_C(a: Byte) extends T_B[Char, T_A[T_A[Int]]]
case class CC_D() extends T_B[Char, T_A[T_A[Int]]]

val v_a: T_B[Char, T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_C(_)