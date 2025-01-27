package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, T_A[Int, C]], c: Byte) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]]
case class CC_C[D](a: (CC_B,CC_A[CC_B]), b: CC_B) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]], T_A[T_A[CC_A[Char], CC_A[Char]], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}