package Program_30 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: ((Byte,Boolean),(Char,Boolean))) extends T_A
case class CC_B(a: (CC_A,Int), b: T_B[CC_A, CC_A], c: (T_A,CC_A)) extends T_A
case class CC_C() extends T_A
case class CC_D[D, C, E](a: T_A, b: E, c: T_B[C, C]) extends T_B[C, D]
case class CC_E[G, F](a: T_B[F, CC_B], b: T_B[F, F], c: G) extends T_B[F, G]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_D(_, _, _), _) => 1 
  case CC_A(CC_E(_, _, _), ((_,_),(_,_))) => 2 
  case CC_B((CC_A(_, _),12), _, _) => 3 
  case CC_B(_, CC_E(_, _, _), (CC_A(_, _),CC_A(_, _))) => 4 
  case CC_B((CC_A(_, _),_), CC_D(_, _, _), (CC_B(_, _, _),CC_A(_, _))) => 5 
  case CC_B(_, CC_E(_, _, _), (CC_C(),CC_A(_, _))) => 6 
  case CC_B((CC_A(_, _),12), CC_E(_, _, _), (CC_A(_, _),CC_A(_, _))) => 7 
  case CC_B(_, CC_D(_, _, _), (CC_A(_, _),CC_A(_, _))) => 8 
  case CC_B((CC_A(_, _),_), _, (CC_A(_, _),CC_A(_, _))) => 9 
  case CC_B((CC_A(_, _),12), CC_E(_, _, _), _) => 10 
  case CC_B((CC_A(_, _),_), CC_E(_, _, _), (CC_C(),CC_A(_, _))) => 11 
  case CC_B((CC_A(_, _),_), _, _) => 12 
  case CC_B(_, _, (CC_B(_, _, _),CC_A(_, _))) => 13 
  case CC_B(_, _, (CC_C(),CC_A(_, _))) => 14 
  case CC_B((CC_A(_, _),12), CC_D(_, _, _), (CC_B(_, _, _),CC_A(_, _))) => 15 
  case CC_B((CC_A(_, _),12), CC_E(_, _, _), (CC_B(_, _, _),CC_A(_, _))) => 16 
  case CC_B((CC_A(_, _),12), CC_D(_, _, _), (CC_C(),CC_A(_, _))) => 17 
  case CC_B((CC_A(_, _),_), CC_E(_, _, _), (CC_B(_, _, _),CC_A(_, _))) => 18 
  case CC_B((CC_A(_, _),12), CC_D(_, _, _), (CC_A(_, _),CC_A(_, _))) => 19 
  case CC_B(_, CC_E(_, _, _), (CC_B(_, _, _),CC_A(_, _))) => 20 
  case CC_B(_, _, (CC_A(_, _),CC_A(_, _))) => 21 
  case CC_B(_, _, _) => 22 
  case CC_B((CC_A(_, _),12), _, (CC_B(_, _, _),CC_A(_, _))) => 23 
  case CC_B(_, CC_D(_, _, _), (CC_C(),CC_A(_, _))) => 24 
  case CC_B(_, CC_D(_, _, _), _) => 25 
  case CC_B((CC_A(_, _),12), _, (CC_C(),CC_A(_, _))) => 26 
  case CC_B(_, CC_D(_, _, _), (CC_B(_, _, _),CC_A(_, _))) => 27 
  case CC_B(_, CC_E(_, _, _), _) => 28 
  case CC_B((CC_A(_, _),_), CC_E(_, _, _), _) => 29 
}
}
// This is not matched: (CC_A (CC_D T_A T_A Boolean (CC_C T_A) Boolean Wildcard (T_B T_A T_A))
//      Wildcard
//      T_A)
// This is not matched: (CC_A Int Byte (T_A Int Byte))