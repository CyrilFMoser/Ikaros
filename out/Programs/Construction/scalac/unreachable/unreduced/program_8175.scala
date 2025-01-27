package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, Char]
case class CC_B[E](a: Int, b: (T_A[Boolean, Char],Int), c: T_A[E, E]) extends T_A[E, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (CC_A(),12), _) => 1 
  case CC_B(_, (CC_A(),_), _) => 2 
  case CC_B(_, (CC_B(_, _, _),12), _) => 3 
  case CC_B(_, (CC_B(_, _, _),_), _) => 4 
}
}