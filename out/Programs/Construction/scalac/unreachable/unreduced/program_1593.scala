package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (T_A[(Byte,Char)],T_A[Boolean]), c: B) extends T_A[T_A[T_A[Char]]]
case class CC_B() extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A[Int]) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_A(_, _, _))