package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_B, c: (T_A[T_B],T_B)) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_B, b: ((CC_B,Byte),T_A[CC_B]), c: (Int,Char)) extends T_B
case class CC_D(a: T_A[((Int,Char),CC_C)], b: T_B, c: CC_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_C(_, _, _), (_,_)), CC_C(CC_C(_, _, _), (_,_), (_,_)), _) => 0 
  case CC_A(CC_A(_, CC_D(_, _, _), (_,_)), CC_C(CC_C(_, _, _), (_,_), (_,_)), _) => 1 
  case CC_A(CC_B(), CC_C(CC_C(_, _, _), (_,_), (_,_)), _) => 2 
  case CC_A(CC_A(_, CC_C(_, _, _), (_,_)), CC_C(CC_D(_, _, _), (_,_), (_,_)), _) => 3 
  case CC_A(CC_A(_, CC_D(_, _, _), (_,_)), CC_C(CC_D(_, _, _), (_,_), (_,_)), _) => 4 
  case CC_A(CC_B(), CC_C(CC_D(_, _, _), (_,_), (_,_)), _) => 5 
  case CC_A(CC_A(_, CC_C(_, _, _), (_,_)), CC_D(_, CC_C(_, _, _), CC_B()), _) => 6 
  case CC_A(CC_A(_, CC_D(_, _, _), (_,_)), CC_D(_, CC_C(_, _, _), CC_B()), _) => 7 
  case CC_A(CC_B(), CC_D(_, CC_C(_, _, _), CC_B()), _) => 8 
  case CC_A(CC_A(_, CC_C(_, _, _), (_,_)), CC_D(_, CC_D(_, _, _), CC_B()), _) => 9 
  case CC_A(CC_A(_, CC_D(_, _, _), (_,_)), CC_D(_, CC_D(_, _, _), CC_B()), _) => 10 
  case CC_A(CC_B(), CC_D(_, CC_D(_, _, _), CC_B()), _) => 11 
  case CC_B() => 12 
}
}