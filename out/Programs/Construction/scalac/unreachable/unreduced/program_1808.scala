package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Byte, Char], CC_A[Int]], b: Char) extends T_A[T_A[T_A[T_A[Char, Char], CC_A[Int]], T_A[T_A[Char, Char], CC_A[Int]]], T_A[T_A[Char, Char], CC_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[T_A[Char, Char], CC_A[Int]], T_A[T_A[Char, Char], CC_A[Int]]], T_A[T_A[Char, Char], CC_A[Int]]]

val v_a: T_A[T_A[T_A[T_A[Char, Char], CC_A[Int]], T_A[T_A[Char, Char], CC_A[Int]]], T_A[T_A[Char, Char], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}