package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[C, (T_A[Byte, Int],T_A[Char, Int])]
case class CC_B() extends T_A[CC_A[(Boolean,Boolean)], (T_A[Byte, Int],T_A[Char, Int])]
case class CC_C(a: (CC_A[CC_B],CC_B), b: CC_A[CC_A[CC_B]], c: T_A[CC_A[CC_B], T_A[Boolean, CC_B]]) extends T_A[CC_A[(Boolean,Boolean)], (T_A[Byte, Int],T_A[Char, Int])]

val v_a: T_A[CC_A[(Boolean,Boolean)], (T_A[Byte, Int],T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_B() => 1 
  case CC_C((_,_), CC_A(_, _), _) => 2 
}
}