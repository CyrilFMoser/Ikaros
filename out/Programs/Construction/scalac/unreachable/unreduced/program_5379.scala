package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Byte], T_A[Boolean]]) extends T_A[T_B[(Char,Byte), T_A[Char]]]
case class CC_B[D](a: CC_A, b: T_A[D]) extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_A[T_B[(Char,Byte), T_A[Char]]]
case class CC_D(a: CC_C[T_A[(Int,Char)]]) extends T_B[T_B[CC_C[CC_A], (CC_A,CC_A)], T_B[T_B[Byte, (Byte,Int)], CC_B[CC_A]]]
case class CC_E(a: (Int,CC_D), b: CC_A, c: Char) extends T_B[T_B[CC_C[CC_A], (CC_A,CC_A)], T_B[T_B[Byte, (Byte,Int)], CC_B[CC_A]]]

val v_a: T_A[T_B[(Char,Byte), T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_A(_), CC_B(_, _)) => 2 
  case CC_B(CC_A(_), CC_C(_)) => 3 
  case CC_C(_) => 4 
}
}