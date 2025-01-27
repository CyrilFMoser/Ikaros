package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: (T_B[(Boolean,Byte), T_A],T_A)) extends T_A
case class CC_B(a: T_B[Byte, T_B[T_A, T_A]], b: T_A) extends T_A
case class CC_C[D](a: CC_A[D]) extends T_B[D, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
}
}