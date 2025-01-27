package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[(Int,Boolean)]], b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[((Byte,Byte),T_B)]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[CC_A], c: Int) extends T_A[CC_A]
case class CC_C(a: T_A[CC_A], b: Boolean, c: T_B) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_B(_, CC_C(_, _, _), _) => 1 
  case CC_C(_, _, _) => 2 
}
}