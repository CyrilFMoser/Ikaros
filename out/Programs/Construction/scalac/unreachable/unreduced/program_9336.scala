package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Boolean, b: Char, c: T_A) extends T_A
case class CC_C[C]() extends T_B[T_B[CC_A, Byte], C]
case class CC_D[D](a: D, b: CC_B) extends T_B[D, T_B[T_A, T_B[CC_B, CC_A]]]
case class CC_E[E](a: T_A, b: T_B[T_B[CC_A, Byte], E], c: (CC_C[T_A],CC_D[Int])) extends T_B[T_B[CC_A, Byte], E]

val v_a: T_B[T_B[CC_A, Byte], T_B[T_A, T_B[CC_B, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _) => 1 
  case CC_E(CC_A(_), CC_C(), (CC_C(),CC_D(_, _))) => 2 
  case CC_E(CC_B(_, _, _), CC_C(), (CC_C(),CC_D(_, _))) => 3 
  case CC_E(CC_A(_), CC_D(_, CC_B(_, _, _)), (CC_C(),CC_D(_, _))) => 4 
  case CC_E(CC_B(_, _, _), CC_D(_, CC_B(_, _, _)), (CC_C(),CC_D(_, _))) => 5 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_C(), (_,_)), (CC_C(),CC_D(_, _))) => 6 
  case CC_E(CC_B(_, _, _), CC_E(CC_A(_), CC_C(), (_,_)), (CC_C(),CC_D(_, _))) => 7 
  case CC_E(CC_A(_), CC_E(CC_B(_, _, _), CC_C(), (_,_)), (CC_C(),CC_D(_, _))) => 8 
  case CC_E(CC_B(_, _, _), CC_E(CC_B(_, _, _), CC_C(), (_,_)), (CC_C(),CC_D(_, _))) => 9 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_D(_, _), (_,_)), (CC_C(),CC_D(_, _))) => 10 
  case CC_E(CC_B(_, _, _), CC_E(CC_A(_), CC_D(_, _), (_,_)), (CC_C(),CC_D(_, _))) => 11 
  case CC_E(CC_A(_), CC_E(CC_B(_, _, _), CC_D(_, _), (_,_)), (CC_C(),CC_D(_, _))) => 12 
  case CC_E(CC_B(_, _, _), CC_E(CC_B(_, _, _), CC_D(_, _), (_,_)), (CC_C(),CC_D(_, _))) => 13 
  case CC_E(CC_A(_), CC_E(CC_A(_), CC_E(_, _, _), (_,_)), (CC_C(),CC_D(_, _))) => 14 
  case CC_E(CC_B(_, _, _), CC_E(CC_A(_), CC_E(_, _, _), (_,_)), (CC_C(),CC_D(_, _))) => 15 
  case CC_E(CC_A(_), CC_E(CC_B(_, _, _), CC_E(_, _, _), (_,_)), (CC_C(),CC_D(_, _))) => 16 
  case CC_E(CC_B(_, _, _), CC_E(CC_B(_, _, _), CC_E(_, _, _), (_,_)), (CC_C(),CC_D(_, _))) => 17 
}
}