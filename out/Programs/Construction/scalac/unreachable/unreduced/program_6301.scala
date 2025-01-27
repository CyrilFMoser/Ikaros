package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[((Char,Byte),Int)], b: (T_A[(Char,Int)],Int), c: T_A[Boolean]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Char, b: T_A[Boolean], c: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: CC_B) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}