package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Boolean, b: (T_A[Byte, Byte],T_A[Boolean, Byte])) extends T_A[T_A[Int, Char], T_A[Int, T_A[Char, Char]]]
case class CC_B[E, D](a: T_A[D, E], b: CC_A) extends T_A[E, D]
case class CC_C(a: T_B[CC_A], b: T_A[T_A[CC_A, CC_A], CC_A]) extends T_A[T_A[Int, Char], T_A[Int, T_A[Char, Char]]]
case class CC_D(a: T_A[Int, CC_C], b: Boolean, c: Char) extends T_B[CC_C]
case class CC_E(a: (CC_A,T_B[CC_C]), b: T_A[T_B[CC_D], T_A[CC_C, CC_D]], c: T_A[(Boolean,CC_A), T_A[CC_D, CC_A]]) extends T_B[CC_C]
case class CC_F() extends T_B[CC_C]

val v_a: T_A[T_A[Int, Char], T_A[Int, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(CC_B(_, _), CC_A(_, _)) => 1 
  case CC_C(_, CC_B(_, _)) => 2 
}
}