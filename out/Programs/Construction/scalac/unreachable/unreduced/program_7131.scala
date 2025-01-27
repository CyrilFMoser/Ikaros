package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: ((CC_A,CC_A),Int), b: T_A[T_B], c: T_B) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: CC_C) extends T_B

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),_), _, CC_C()) => 1 
  case CC_B(((_,_),_), _, CC_D(CC_C())) => 2 
  case CC_B(((_,_),_), _, CC_E(_)) => 3 
}
}