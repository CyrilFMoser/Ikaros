package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Byte,Byte), Byte]], C]
case class CC_B[D](a: Int) extends T_A[T_A[T_A[Boolean, Boolean], T_A[(Byte,Byte), Byte]], D]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[(Byte,Byte), Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, true, _) => 0 
  case CC_A(_, false, _) => 1 
  case CC_B(12) => 2 
  case CC_B(_) => 3 
}
}