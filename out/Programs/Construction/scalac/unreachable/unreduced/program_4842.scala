package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: T_A[Boolean], c: T_A[T_A[Char]]) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: T_A[T_A[CC_A]], b: T_A[T_A[CC_B]], c: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, CC_A(_, _, _)) => 2 
}
}