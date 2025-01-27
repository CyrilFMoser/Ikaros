package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: T_B[E]) extends T_A[E, D]
case class CC_B[G, H](a: T_A[H, G]) extends T_A[G, H]
case class CC_C(a: T_A[CC_A[Char, Byte, (Boolean,Byte)], T_A[Boolean, Byte]], b: T_A[CC_A[Boolean, Byte, (Byte,Byte)], CC_B[Int, Byte]], c: CC_A[T_A[Int, Byte], CC_B[Int, (Char,Byte)], T_A[Boolean, Int]]) extends T_B[T_B[CC_A[Byte, Int, Byte]]]
case class CC_D(a: T_A[CC_A[CC_C, Boolean, CC_C], Boolean], b: T_A[(CC_C,(Boolean,Byte)), T_A[CC_C, Byte]]) extends T_B[T_B[CC_A[Byte, Int, Byte]]]

val v_a: T_A[T_B[T_B[CC_A[Byte, Int, Byte]]], Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_A(_)