package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[T_B[Int, (Boolean,Char)], T_A[(Byte,Byte)]]]
case class CC_B(a: T_B[CC_A, CC_A], b: T_B[T_B[(Byte,Byte), (Byte,Char)], CC_A]) extends T_A[T_B[T_B[Int, (Boolean,Char)], T_A[(Byte,Byte)]]]
case class CC_C[D](a: CC_B, b: T_B[T_A[D], D], c: T_B[T_A[D], D]) extends T_B[T_A[D], D]
case class CC_D[E](a: CC_A) extends T_B[T_A[E], E]

val v_a: T_B[T_A[Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), _, _), CC_C(_, CC_C(_, _, _), _)) => 0 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), _, _), CC_C(_, CC_D(_), _)) => 1 
  case CC_C(CC_B(_, _), CC_C(CC_B(_, _), _, _), CC_D(_)) => 2 
  case CC_C(CC_B(_, _), CC_D(CC_A()), CC_C(_, CC_C(_, _, _), _)) => 3 
  case CC_C(CC_B(_, _), CC_D(CC_A()), CC_C(_, CC_D(_), _)) => 4 
  case CC_C(CC_B(_, _), CC_D(CC_A()), CC_D(_)) => 5 
  case CC_D(CC_A()) => 6 
}
}