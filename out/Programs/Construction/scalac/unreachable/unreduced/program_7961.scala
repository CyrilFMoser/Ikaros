package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_B[T_A]), b: (T_A,T_B[T_A]), c: T_B[Int]) extends T_A
case class CC_B(a: CC_A, b: T_B[T_A], c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Char, b: T_B[Char]) extends T_B[CC_B]
case class CC_E(a: (T_B[CC_B],T_B[CC_B])) extends T_B[CC_B]
case class CC_F() extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),_), (CC_A(_, _, _),_), _) => 0 
  case CC_A((CC_A(_, _, _),_), (CC_B(_, _, _),_), _) => 1 
  case CC_A((CC_A(_, _, _),_), (CC_C(),_), _) => 2 
  case CC_A((CC_B(_, _, _),_), (CC_A(_, _, _),_), _) => 3 
  case CC_A((CC_B(_, _, _),_), (CC_B(_, _, _),_), _) => 4 
  case CC_A((CC_B(_, _, _),_), (CC_C(),_), _) => 5 
  case CC_A((CC_C(),_), (CC_A(_, _, _),_), _) => 6 
  case CC_A((CC_C(),_), (CC_B(_, _, _),_), _) => 7 
  case CC_A((CC_C(),_), (CC_C(),_), _) => 8 
  case CC_B(_, _, _) => 9 
  case CC_C() => 10 
}
}