package Program_22 

 object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[T_A[Byte]]
case class CC_B[B](a: B, b: T_A[CC_A]) extends T_A[B]
case class CC_C[C](a: C) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(_, CC_B(_, CC_C(_))) => 1 
  case CC_B(_, CC_C(CC_A(_))) => 2 
  case CC_B(_, CC_B(CC_A(_), _)) => 3 
  case CC_B(_, CC_B(_, _)) => 4 
  case CC_B(_, CC_B(CC_A(_), CC_B(_, _))) => 5 
  case CC_B(_, CC_B(CC_A(_), CC_C(_))) => 6 
}
}