package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]]
case class CC_B[D](a: CC_A[CC_A[D]]) extends T_A[D, T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]]
case class CC_C(a: CC_A[CC_B[Byte]], b: Byte) extends T_A[T_A[CC_A[Boolean], CC_B[Boolean]], T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]]

val v_a: T_A[T_A[CC_A[Boolean], CC_B[Boolean]], T_A[T_A[(Int,Byte), Char], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_C(CC_A(CC_B(_), CC_B(_)), _) => 2 
}
}