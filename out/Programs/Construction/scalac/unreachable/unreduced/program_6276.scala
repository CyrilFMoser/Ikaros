package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: (T_A[(Int,Byte)],T_A[Byte]), c: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: CC_A, b: CC_A, c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: Boolean, b: T_A[T_A[Byte]]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _)), CC_A(12, (_,_), CC_A(_, _, _)), _) => 1 
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _)), CC_A(12, (_,_), CC_B(_, _, _)), _) => 2 
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _)), CC_A(12, (_,_), CC_C(_, _)), _) => 3 
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _)), CC_A(_, (_,_), CC_A(_, _, _)), _) => 4 
  case CC_B(CC_A(_, (_,_), CC_A(_, _, _)), CC_A(_, (_,_), CC_B(_, _, _)), _) => 5 
  case CC_B(CC_A(_, (_,_), CC_B(_, _, _)), CC_A(12, (_,_), CC_A(_, _, _)), _) => 6 
  case CC_B(CC_A(_, (_,_), CC_B(_, _, _)), CC_A(12, (_,_), CC_B(_, _, _)), _) => 7 
  case CC_B(CC_A(_, (_,_), CC_B(_, _, _)), CC_A(12, (_,_), CC_C(_, _)), _) => 8 
  case CC_B(CC_A(_, (_,_), CC_B(_, _, _)), CC_A(_, (_,_), CC_A(_, _, _)), _) => 9 
  case CC_B(CC_A(_, (_,_), CC_B(_, _, _)), CC_A(_, (_,_), CC_B(_, _, _)), _) => 10 
  case CC_B(CC_A(_, (_,_), CC_B(_, _, _)), CC_A(_, (_,_), CC_C(_, _)), _) => 11 
  case CC_B(CC_A(_, (_,_), CC_C(_, _)), CC_A(12, (_,_), CC_A(_, _, _)), _) => 12 
  case CC_B(CC_A(_, (_,_), CC_C(_, _)), CC_A(12, (_,_), CC_B(_, _, _)), _) => 13 
  case CC_B(CC_A(_, (_,_), CC_C(_, _)), CC_A(12, (_,_), CC_C(_, _)), _) => 14 
  case CC_B(CC_A(_, (_,_), CC_C(_, _)), CC_A(_, (_,_), CC_A(_, _, _)), _) => 15 
  case CC_B(CC_A(_, (_,_), CC_C(_, _)), CC_A(_, (_,_), CC_B(_, _, _)), _) => 16 
  case CC_B(CC_A(_, (_,_), CC_C(_, _)), CC_A(_, (_,_), CC_C(_, _)), _) => 17 
  case CC_C(_, _) => 18 
}
}
// This is not matched: CC_B(CC_A(_, (_,_), CC_A(_, _, _)), CC_A(_, (_,_), CC_C(_, _)), _)