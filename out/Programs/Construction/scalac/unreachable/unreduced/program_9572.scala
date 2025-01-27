package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, T_A[Boolean, (Byte,Char)]]) extends T_A[T_A[(Byte,Byte), T_A[Int, Boolean]], Int]
case class CC_B(a: T_A[T_A[CC_A, CC_A], CC_A], b: T_A[CC_A, T_A[Char, CC_A]]) extends T_A[T_A[(Byte,Byte), T_A[Int, Boolean]], Int]
case class CC_C(a: CC_B) extends T_A[T_A[(Byte,Byte), T_A[Int, Boolean]], Int]

val v_a: T_A[T_A[(Byte,Byte), T_A[Int, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_)