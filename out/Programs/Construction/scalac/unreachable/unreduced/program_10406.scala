package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte) extends T_A
case class CC_B(a: T_B[Int, T_B[T_A, T_A]], b: CC_A, c: (T_A,T_B[T_A, (Int,Int)])) extends T_A
case class CC_C(a: T_A, b: (Boolean,Byte), c: CC_B) extends T_A
case class CC_D[C]() extends T_B[CC_A, C]
case class CC_E[D](a: D, b: CC_C) extends T_B[CC_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _), (_,_)), _) => 1 
  case CC_A(CC_C(CC_A(_, _), (_,_), CC_B(_, _, _)), _) => 2 
  case CC_A(CC_C(CC_B(_, _, _), (_,_), CC_B(_, _, _)), _) => 3 
  case CC_A(CC_C(CC_C(_, _, _), (_,_), CC_B(_, _, _)), _) => 4 
  case CC_C(CC_A(CC_A(_, _), _), (_,_), CC_B(_, _, (_,_))) => 5 
  case CC_C(CC_A(CC_B(_, _, _), _), (_,_), CC_B(_, _, (_,_))) => 6 
  case CC_C(CC_A(CC_C(_, _, _), _), (_,_), CC_B(_, _, (_,_))) => 7 
  case CC_C(CC_B(_, _, _), (_,_), CC_B(_, _, (_,_))) => 8 
  case CC_C(CC_C(CC_A(_, _), (_,_), _), (_,_), CC_B(_, _, (_,_))) => 9 
  case CC_C(CC_C(CC_B(_, _, _), (_,_), _), (_,_), CC_B(_, _, (_,_))) => 10 
  case CC_C(CC_C(CC_C(_, _, _), (_,_), _), (_,_), CC_B(_, _, (_,_))) => 11 
}
}
// This is not matched: CC_B(_, _, _)