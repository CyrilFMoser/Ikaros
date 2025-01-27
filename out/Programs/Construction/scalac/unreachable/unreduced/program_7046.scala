package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(((Boolean,Byte),Char),(T_B,Char))]
case class CC_B(a: T_A[T_A[(Char,Int)]], b: T_A[T_B]) extends T_B
case class CC_C[B](a: (T_B,T_A[T_B]), b: T_B) extends T_B
case class CC_D(a: Int, b: Int) extends T_B

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(_, _)) => 0 
  case CC_C(_, CC_C(_, _)) => 1 
}
}
// This is not matched: CC_C(_, CC_D(_, _))