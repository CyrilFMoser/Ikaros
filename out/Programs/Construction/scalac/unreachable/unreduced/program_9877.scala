package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Char]], b: T_B[T_B[(Int,Byte), Char], Char], c: T_B[T_B[Int, Int], T_B[Int, Byte]]) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_B[T_A[Boolean], T_A[Int]]]
case class CC_C[D](a: D) extends T_A[D]
case class CC_D[E]() extends T_B[E, CC_B]

val v_a: T_A[T_B[T_A[Boolean], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_C(CC_C(_))) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(CC_C(_), _, _)