package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[Boolean, Byte]) extends T_A[Boolean, Byte]
case class CC_B(a: (T_A[Boolean, Byte],T_A[CC_A, CC_A]), b: T_A[CC_A, T_A[CC_A, CC_A]], c: ((CC_A,CC_A),CC_A)) extends T_A[Boolean, Byte]
case class CC_C(a: CC_B) extends T_A[Boolean, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B((_,_), _, _)) => 3 
  case CC_A(CC_C(CC_B(_, _, _))) => 4 
  case CC_B((CC_A(_),_), _, ((_,_),CC_A(_))) => 5 
  case CC_B((CC_B(_, _, _),_), _, ((_,_),CC_A(_))) => 6 
  case CC_B((CC_C(_),_), _, ((_,_),CC_A(_))) => 7 
  case CC_C(CC_B(_, _, _)) => 8 
}
}