package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: ((CC_A,(Char,Boolean)),T_A[CC_A]), b: Char) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(((_,_),_), 'x') => 1 
  case CC_B(((_,_),_), _) => 2 
  case CC_C() => 3 
}
}