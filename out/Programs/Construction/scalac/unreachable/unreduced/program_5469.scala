package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (Boolean,Boolean)) extends T_A[Char]
case class CC_B() extends T_B
case class CC_C(a: T_A[Char], b: T_A[CC_B], c: CC_A) extends T_B
case class CC_D(a: T_B, b: (T_B,CC_B), c: Byte) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), (_,_)) => 0 
  case CC_A(CC_C(CC_A(_, _), _, CC_A(_, _)), (_,_)) => 1 
  case CC_A(CC_D(CC_B(), (_,_), 0), (_,_)) => 2 
  case CC_A(CC_D(CC_C(_, _, _), (_,_), 0), (_,_)) => 3 
  case CC_A(CC_D(CC_D(_, _, _), (_,_), 0), (_,_)) => 4 
  case CC_A(CC_D(CC_B(), (_,_), _), (_,_)) => 5 
  case CC_A(CC_D(CC_C(_, _, _), (_,_), _), (_,_)) => 6 
  case CC_A(CC_D(CC_D(_, _, _), (_,_), _), (_,_)) => 7 
}
}