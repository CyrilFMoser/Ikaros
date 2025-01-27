package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[(Byte,Int), Int], b: (Char,Byte), c: T_B[Byte, Boolean]) extends T_A[T_B[Int, Int], (Int,Byte)]
case class CC_B() extends T_A[T_B[Int, Int], (Int,Byte)]
case class CC_C(a: T_B[CC_B, CC_B], b: T_B[CC_B, Boolean]) extends T_B[T_B[CC_B, CC_B], (Boolean,Char)]
case class CC_D[F, E, G](a: CC_A, b: T_A[E, F]) extends T_B[E, F]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',0), _) => 0 
  case CC_A(CC_D(_, _), ('x',0), CC_D(_, _)) => 1 
  case CC_A(_, (_,_), CC_D(_, _)) => 2 
  case CC_A(CC_D(_, _), ('x',0), _) => 3 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_D Boolean
//            Byte
//            Boolean
//            (CC_A Wildcard
//                  Wildcard
//                  Wildcard
//                  (T_A (T_B Int Int) (Tuple Int Byte)))
//            Wildcard
//            (T_B Byte Boolean))
//      (T_A (T_B Int Int) (Tuple Int Byte)))
// This is not matched: Pattern match is empty without constants