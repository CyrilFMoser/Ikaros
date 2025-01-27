package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (T_A[Byte, Byte],(Int,(Boolean,Int)))) extends T_A[C, (T_A[Boolean, Byte],T_A[Boolean, Int])]
case class CC_B() extends T_A[CC_A[CC_A[Byte]], (T_A[Boolean, Byte],T_A[Boolean, Int])]
case class CC_C(a: CC_B) extends T_A[CC_A[CC_A[Byte]], (T_A[Boolean, Byte],T_A[Boolean, Int])]

val v_a: T_A[CC_A[CC_A[Byte]], (T_A[Boolean, Byte],T_A[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,(_,_))) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}