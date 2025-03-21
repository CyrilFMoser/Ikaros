package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_C())) => 0 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_B(_, _),CC_B(_, _))) => 1 
  case CC_A((CC_A(_, _, _),CC_C()), CC_A(_, _, _), (CC_C(),CC_C())) => 2 
  case CC_A((CC_C(),CC_B(_, _)), CC_C(), (CC_A(_, _, _),CC_B(_, _))) => 3 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), (CC_B(_, _),CC_A(_, _, _))) => 4 
  case CC_A((CC_A(_, _, _),CC_C()), CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _))) => 5 
  case CC_A(_, CC_A(_, _, _), (CC_B(_, _),CC_C())) => 6 
  case CC_A((CC_C(),CC_C()), CC_B(_, _), (CC_A(_, _, _),CC_A(_, _, _))) => 7 
}
}
// This is not matched: (CC_A (Tuple (CC_A Wildcard (CC_C T_A) Wildcard T_A)
//             (CC_A Wildcard Wildcard Wildcard T_A))
//      (CC_C T_A)
//      Wildcard
//      T_A)