package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Byte]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B(a: Boolean, b: (T_A[Char],T_A[CC_A])) extends T_A[T_A[Char]]
case class CC_C(a: T_A[Byte]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}