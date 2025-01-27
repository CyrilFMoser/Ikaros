package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Boolean,(Int,Char)), T_B[Byte, Char]]) extends T_A[T_B[((Char,Byte),Byte), T_A[Int]]]
case class CC_B(a: T_A[CC_A], b: Char) extends T_A[T_B[((Char,Byte),Byte), T_A[Int]]]
case class CC_C(a: Byte, b: CC_A, c: CC_A) extends T_A[T_B[((Char,Byte),Byte), T_A[Int]]]

val v_a: T_A[T_B[((Char,Byte),Byte), T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A(_), CC_A(_)) => 2 
}
}