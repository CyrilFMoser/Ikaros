package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[Char, T_A[Char, Byte]], C]
case class CC_B(a: (T_A[Boolean, Boolean],T_A[Boolean, Char]), b: CC_A[CC_A[Int]]) extends T_A[T_A[T_A[Byte, Boolean], CC_A[Char]], T_A[CC_A[Char], CC_A[Char]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Byte, Boolean], CC_A[Char]], T_A[CC_A[Char], CC_A[Char]]]

val v_a: T_A[T_A[T_A[Byte, Boolean], CC_A[Char]], T_A[CC_A[Char], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(CC_B(_, CC_A())) => 1 
}
}