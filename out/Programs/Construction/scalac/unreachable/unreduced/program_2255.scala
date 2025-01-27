package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[T_A],T_B[Char]), b: (T_B[Byte],T_A), c: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: T_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: Int, c: Char) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_A((_,_), _, CC_A(_, _, _))) => 0 
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_A((_,_), _, CC_B(_, _, _))) => 1 
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_A((_,_), _, CC_C())) => 2 
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 3 
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_B(_, CC_B(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_B(_, CC_C(), CC_A(_, _, _))) => 5 
  case CC_A((_,_), (_,CC_A(_, _, _)), CC_C()) => 6 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_A((_,_), _, CC_A(_, _, _))) => 7 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_A((_,_), _, CC_B(_, _, _))) => 8 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_A((_,_), _, CC_C())) => 9 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 10 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_B(_, CC_B(_, _, _), CC_A(_, _, _))) => 11 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_B(_, CC_C(), CC_A(_, _, _))) => 12 
  case CC_A((_,_), (_,CC_B(_, _, _)), CC_C()) => 13 
  case CC_A((_,_), (_,CC_C()), CC_A((_,_), _, CC_B(_, _, _))) => 14 
  case CC_A((_,_), (_,CC_C()), CC_A((_,_), _, CC_C())) => 15 
  case CC_A((_,_), (_,CC_C()), CC_B(_, CC_A(_, _, _), CC_A(_, _, _))) => 16 
  case CC_A((_,_), (_,CC_C()), CC_B(_, CC_B(_, _, _), CC_A(_, _, _))) => 17 
  case CC_A((_,_), (_,CC_C()), CC_B(_, CC_C(), CC_A(_, _, _))) => 18 
  case CC_A((_,_), (_,CC_C()), CC_C()) => 19 
  case CC_B(_, _, _) => 20 
  case CC_C() => 21 
}
}
// This is not matched: CC_A((_,_), (_,CC_C()), CC_A((_,_), _, CC_A(_, _, _)))